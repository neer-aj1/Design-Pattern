package AFactory;
public class LaptopFactory extends AbstractDeviceFactory{
    Device getGadget(DeviceType dType) {
        switch (dType) {
            case HP -> {
                return new Hp("8gb", "AMD", "NVIDIA");
            }
            case DELL -> {
                return new Dell("8gb", "AMD", "NVIDIA");
            }
        }
        return null;
    }
}
