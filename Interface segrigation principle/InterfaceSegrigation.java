interface InputDevicesMouse{
    void Mouse();
}
interface InputDevicesKeyboard{
    void Keyboard();
}
interface OutputDevicesMonitor{
    void Monitor();
    }
interface OutputDevicesSpeakers{
    void Speakers();
    }


class Desktop implements InputDevicesMouse, InputDevicesKeyboard, OutputDevicesMonitor, OutputDevicesSpeakers{

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
    


class Laptops implements InputDevicesMouse, OutputDevicesSpeakers{

    
        @Override
        public void Mouse() {
            System.out.println("Mouse will help you to point on something in screen.");
        }
        @Override
        public void Speakers() {
            System.out.println("It will help you to listen the sound which is prodided as an output.");
        }
}

public class InterfaceSegrigation{
    public static void main(String[] args) {
        Desktop desktop= new Desktop();
        Laptops laptops = new Laptops();
        desktop.Mouse();
        desktop.Keyboard();
        desktop.Monitor();
        desktop.Speakers();
        laptops.Mouse();
        laptops.Speakers();
    }
}
