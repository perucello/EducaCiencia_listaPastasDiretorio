package manipulando_diretorio_java;

public class Main {

    public static void main(String[] args) {

        //Endereço - path
        String pasta = "C:\\EducaCienciaFastCode";
 
        Listando_arquivos_diretorio listarDiretorio = new Listando_arquivos_diretorio();
        listarDiretorio.lista_arquivos_diretorio(pasta);

    }
}
