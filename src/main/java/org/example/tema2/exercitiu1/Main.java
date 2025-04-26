package org.example.tema2.exercitiu1;

public class Main {
    public static void main(String[] args) {
        ActiuneService actiuneService = ActiuneService.getInstance();

        Utilizator admin = new Administrator("Admin", "Adminescu");
        Utilizator editor = new Editor("Editor", "Editorescu");
        Utilizator vizitator = new Vizitator("Vizitator", "Vizitatorescu");

        actiuneService.afiseazaPermisiuni(admin);
        actiuneService.afiseazaPermisiuni(editor);
        actiuneService.afiseazaPermisiuni(vizitator);
    }
}
