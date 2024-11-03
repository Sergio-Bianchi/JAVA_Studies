public class Tassometro {
    Double[] soglie = new Double[3];
    Double[] aliquote = new Double[3];


    public Tassometro
            (double sogliaUNO, double sogliaDUE, double sogliaTRE) {
        soglie[0] = sogliaUNO;
        soglie[1] = sogliaDUE;
        soglie[2] = sogliaTRE;
        aliquote[0] = 10.0 / 100;
        aliquote[1] = 26.0 / 100;
        aliquote[2] = 35.0 / 100;
    }

    public Tassometro
            (double sogliaUNO, double sogliaDUE, double sogliaTRE,
             double aliquotaUNO, double aliquotaDUE, double aliquotaTRE
            ) {
        soglie[0] = sogliaUNO;
        soglie[1] = sogliaDUE;
        soglie[2] = sogliaTRE;
        aliquote[0] = aliquotaUNO / 100;
        aliquote[1] = aliquotaDUE / 100;
        aliquote[2] = aliquotaTRE / 100;
    }


    public double getTasse(Double importo) {
        double output = 0.0;
        double importoCache = importo;
        for (int i = 0; i < 3; i++) {
            if (importoCache <= soglie[i]) {
                if (i == 0) {
                    output += importoCache * aliquote[0];
                } else {
                    output += importoCache * aliquote[i];
                    importoCache -= soglie[i];
                }
                return output;
            } else {
                output += soglie[i] * aliquote[i];
                importoCache -= soglie[i];
            }
        }

        return output;

    }

    public double getSoglia(int soglia) {
        return soglie[soglia+1];
    }

    public void setSoglia(int soglia, double valore) {
        soglie[soglia+1] = valore;
    }



}
