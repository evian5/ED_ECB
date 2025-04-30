class ECB_GravedadPlaneta {
    public class GravedadPlaneta {
        private int id;
        private String nombre;
        private double GravedadPlaneta;

        // Esto es el String
        @Override
        public String toString() {
            return "GravedadPlaneta [id=" + id + ", nombre=" + nombre + ", GravedadPlaneta=" + GravedadPlaneta + "]";
        }

        public GravedadPlaneta(int id, String nombre, double gravedadPlaneta) {
            this.id = id;
            this.nombre = nombre;
            GravedadPlaneta = gravedadPlaneta;
        }

        // Estos son los getter and setter y el constructor
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getGravedadPlaneta() {
            return GravedadPlaneta;
        }

        public void setGravedadPlaneta(double gravedadPlaneta) {
            GravedadPlaneta = gravedadPlaneta;
        }
    }
}
