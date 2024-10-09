public class municipio{
public static void main(String[] args) {

CandidatoPerfeito pref= new CandidatoPerfeito("GIVANILDO TRUMI", "16/06/1976", 'M', 237950.00, true, 11,"ALMIRO ALVES DE LIMA", "20");

CandidatoVereador vere = new CandidatoVereador("ALINE PINNO", "10/04/1994", 'F', 5000.00, false, 40555,"555","Barracão");

System.out.println("Prefeito:\n"+pref);
System.out.println("Vereador:\n"+vere);
}
}