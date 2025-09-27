package AbstractionInJava;
abstract class WebDriverEx{
    abstract void findElement();
    abstract void driverQuit();
    abstract void get();
}
class chromeDriverEx extends WebDriverEx{

    @Override
    void findElement() {

    }

    @Override
    void driverQuit() {

    }

    @Override
    void get() {

    }
}

class fireFoxEx extends WebDriverEx{

    @Override
    void findElement() {

    }

    @Override
    void driverQuit() {

    }

    @Override
    void get() {

    }
}



public class WebDriverImplementation {

    public static void main(String[] args) {
        fireFoxEx ff =new fireFoxEx();
        ff.driverQuit();
        ff.get();
        ff.findElement();
    }
}
