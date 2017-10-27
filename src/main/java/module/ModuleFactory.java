package module;

public class ModuleFactory {

    public static ModuleInt getModuleByType(String type) {
        switch (type) {
            case "DI32":
                return new DI32();
            case "DO32":
                return new DO32();
            case "AIG16":
                return new AIG16();
        }
        throw new RuntimeException("unknown type module " + type);
    }

}
