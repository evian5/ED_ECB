class Persona_ECB {
    public class Persona {

        private int id;
        private int nombre;
        private double masa;
        private double altura;
        private int edad;

        // Esto es el String
        @Override
        public String toString() {
            return "Persona [id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad="
                    + edad + "]";
        }

        // Estos son los getters and setter mas el constructor

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getNombre() {
            return nombre;
        }

        public void setNombre(int nombre) {
            this.nombre = nombre;
        }

        public double getMasa() {
            return masa;
        }

        public void setMasa(double masa) {
            this.masa = masa;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Persona(int id, int nombre, double masa, double altura, int edad) {
            this.id = id;
            this.nombre = nombre;
            this.masa = masa;
            this.altura = altura;
            this.edad = edad;
        }
    }
}
