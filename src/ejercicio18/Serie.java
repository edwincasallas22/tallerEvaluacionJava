package ejercicio18;

public class Serie implements Entregable {

    private static int SEASON_DEFAULT = 3;
    private static boolean SUBMITTED_DEFAULT = false;
    private String tittle;
    private int numberSeason;
    private boolean submitted;
    private String genreFilm;
    private String creator;

    public Serie(String tittle, int numberSeason, String genreFilm, String creator){
        this(tittle, creator);
        this.numberSeason = numberSeason;
        this.genreFilm = genreFilm;
    }

    public Serie(String tittle, String creator){
        this();
        this.tittle = tittle;
        this.creator = creator;
    }

    public Serie(){
        this.tittle = "";
        this.numberSeason = SEASON_DEFAULT;
        this.submitted = SUBMITTED_DEFAULT;
        this.genreFilm = "";
        this.creator = "";
    }

    public int getNumberSeason() {
        return numberSeason;
    }

    public void setNumberSeason(int numberSeason) {
        this.numberSeason = numberSeason;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    @Override
    public String toString() {
        return "Nombre de la serie: '" + tittle + '\'' +
                "\n Número de temporadas: " + numberSeason +
                "\n Entregado: " + submitted +
                "\n Genero='" + genreFilm + '\'' +
                "\n Creador='" + creator + '\'';
    }

    @Override
    public void entregar(){
        this.submitted = true;
    }

    @Override
    public void devolver() {
        this.submitted = false;
    }

    @Override
    public boolean isEntregado() {
        return submitted;
    }

    @Override
    public boolean compareTo(Object a) {
        boolean valueReturn;
        if(this.getNumberSeason() > ((Serie)a).getNumberSeason()){
            valueReturn = true;
        }
        else{
            valueReturn = false;
        }
        return valueReturn;
    }
}
