/*
 * Autor: Crisan, Marius Sorin
 * Fecha: 11-03-18
 * Fichero: Clase carta de la lógica del guiñote
 */


public class Carta {
    int valor;
    String palo;

    public Carta(int valor, String palo) throws ExceptionCartaIncorrecta {
        if ((valor>0 && valor<8) || (valor >= 10 && valor <= 12)){
            this.valor = valor;
        } else throw new ExceptionCartaIncorrecta("Valor incorrecto: " + valor);

        if (palo == "C" || palo == "B" || palo == "O"|| palo == "E"){
            this.palo = palo;
        } else throw new ExceptionCartaIncorrecta("Palo incorrecto: " + palo);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws ExceptionCartaIncorrecta {
        if ((valor>0 && valor<8) || (valor >= 10 && valor <= 12)){
            this.valor = valor;
        } else throw new ExceptionCartaIncorrecta("Valor incorrecto: " + valor);
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) throws ExceptionCartaIncorrecta {
        if (palo == "C" || palo == "B" || palo == "O"|| palo == "E"){
            this.palo = palo;
        } else throw new ExceptionCartaIncorrecta("Palo incorrecto: " + palo);
    }
}
