package day11.vo;

public class MovieVO {
      private String title;
      private String openDay;
      private String actor;
      private String gener;
      private String runningTime;
      private String grade;

      public MovieVO(){}
      public MovieVO(String title,String grade,String gener){
          this.title = title;
          this.grade = grade;
          this.gener = gener;
      }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpenDay() {
        return openDay;
    }

    public void setOpenDay(String openDay) {
        this.openDay = openDay;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", openDay='" + openDay + '\'' +
                ", actor='" + actor + '\'' +
                ", gener='" + gener + '\'' +
                ", runningTime='" + runningTime + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
