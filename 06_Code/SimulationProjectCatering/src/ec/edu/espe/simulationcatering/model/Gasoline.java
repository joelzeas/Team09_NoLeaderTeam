package ec.edu.espe.simulationcatering.model;

/**
 *
 * @author Melanie Terán
 */
public class Gasoline {

    public float calculateGasolinePrice(float gallonsGasoline) {
        float priceOfGasoline = (float) ((2.55) * gallonsGasoline);
        float GasolinePrice = (float) (Math.round(priceOfGasoline * 100.0) / 100.0);
        if (GasolinePrice < 0) {
            return -1;
        } else {
            return GasolinePrice;
        }
    }
}
