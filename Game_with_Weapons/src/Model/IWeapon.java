package Model;

public interface IWeapon {
    public default int use(int ap){
        return 0;
    }
    public default String getName(){
        return null;
    }
}
