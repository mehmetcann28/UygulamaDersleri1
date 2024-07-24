package week04.kks.refactoring;

class MailDB<T> {
	private OzelListe<T> mailOzelListe = new OzelListe<>();
	
	public T save(T mail){
		return mailOzelListe.add(mail);
	}
	
	public T[] saveAll(T[] mailArr){
		return mailOzelListe.addAll(mailArr);
	}
	
	public T update(T mail){
		T[] mailDizisi = mailOzelListe.getVeriDizisi();
		int index = 0;
		for(T mail1: mailDizisi){
			if (getId(mail1) == getId(mail)) {
				return mailOzelListe.replace(index, mail);
			}
			index++;
		}
		return null;
	}
	
	public T[] findAll(){
		T[] mailDizisi = mailOzelListe.getVeriDizisi();
		for(T mail : mailDizisi){
			System.out.println(mail);
		}
		return mailDizisi;
	}
	
	public T findById(int id){
		T[] mailDizisi = mailOzelListe.getVeriDizisi();
		for(T mail : mailDizisi){
			if (getId(mail) == id) {
				return mail;
			}
		}
		return null;
	}
	
	private int getId(T obj) {
		try {
			return (int) obj.getClass().getMethod("getId").invoke(obj);
		} catch (Exception e) {
			throw new RuntimeException("getId method is not defined for " + obj.getClass().getName());
		}
	}
}