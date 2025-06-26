import java.util.Set;

public interface lContainer {

    String getReference();
    int getVolume();
    int volumeDisposable();
    int getResistance();
    Set<IProduct> getProductos();

    //Tipo contenedor

    String getType();

    int getSurFace();

    boolean canInsert(IProduct product);
    boolean isResistanTo(IProduct product);

}
