public class main {
    public static void main(String[] args) {
        lutador[] lut = new lutador[6];
        lut[0] = new lutador(
                "Pretty Boy", "França", 1.75, 68.9, 31, 11, 2, 1);
        lut[1] = new lutador(
                "Putscript", "Brasil", 1.68, 57.8, 29, 14, 2, 3);
        lut[2] = new lutador(
                "Snapshadow", "EUA", 1.65, 80.9, 35, 12, 2 , 1);
        lut[3] = new lutador(
                "Deadcode", "Austrália", 1.93, 81.6, 28, 13, 0, 2);
        lut[4] = new lutador(
                "Ufocobol", "Brasil", 1.70, 119.3, 37, 5, 4, 3);
        lut[5] = new lutador(
                "Nerdaard", "EUA", 1.81, 105.7, 30, 12, 2, 4);

        lut[0].apresentar();
        lut[0].status();
        lut[3].getCategoria();
        lut[1].ganharLuta();
        lut[0].empatarLuta();



    }
}
