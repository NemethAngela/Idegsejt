public class App {
    public static void main(String[] args) {
        
        Erzo erzo = new Erzo();
        IdegsejtMukodes ideg01 = new IdegsejtMukodes(erzo);
        ideg01.felvetel();
        ideg01.tovabbit();
        ideg01.feldolgoz();

        System.out.println();

        Mozgato mozgato = new Mozgato();
        IdegsejtMukodes ideg02 = new IdegsejtMukodes(mozgato);
        ideg02.felvetel();
        ideg02.tovabbit();
        ideg02.feldolgoz();

        System.out.println();

        Asszociacios asszociacios = new Asszociacios();
        IdegsejtMukodes ideg03 = new IdegsejtMukodes(asszociacios);
        ideg03.felvetel();
        ideg03.tovabbit();
        ideg03.feldolgoz();

    }
}
