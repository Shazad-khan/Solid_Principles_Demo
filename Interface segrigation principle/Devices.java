
interface InputDevices{
    void Mouse();
    void Keyboard();
}

interface OutputDevices{
    void Monitor();
    void Speakers();
    }


class Desktop implements InputDevices, OutputDevices{

        @Override
        public void Mouse() {
            System.out.println("Mouse will help you to point on something in screen.");
        }
        @Override
        public void Keyboard() {
            System.out.println("Keybord will help you to give any output by pressing the buttions on it.");
        }
        @Override
        public void Monitor() {
            System.out.println("It will help you to interact with the graphical interface of a system.");
        }
        @Override
        public void Speakers() {
            System.out.println("It will help you to listen the sound which is prodided as an output.");
        }
}
    


class Laptops implements InputDevices, OutputDevices{

    
    @Override
        public void Mouse() {
            System.out.println("Mouse will help you to point on something in screen.");
        }
        @Override
        public void Keyboard() {
            
        }
        @Override
        public void Monitor() {
            
        }
        @Override
        public void Speakers() {
            System.out.println("It will help you to listen the sound which is prodided as an output.");
        }
}

public class Devices{
    public static void main(String[] args) {
        Desktop desktop= new Desktop();
        Laptops laptops = new Laptops();
        desktop.Mouse();
        desktop.Keyboard();
        desktop.Monitor();
        desktop.Speakers();

        laptops.Mouse();
        laptops.Keyboard();
        laptops.Monitor();
        laptops.Speakers();
    }
}
