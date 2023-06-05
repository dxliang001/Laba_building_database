package models;
import java.sql.Date;
import java.util.Objects;

public class Projects {
    private int projectId;
    private String projectName;
    private Date startDate;
    private Date endDate;
    private Clients clientId;
    private String projectStatus;

    public Projects(int projectId, String projectName, Date startDate, Date endDate, Clients clientId, String projectStatus) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.clientId = clientId;
        this.projectStatus = projectStatus;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Clients getClientId() {
        return clientId;
    }

    public void setClientId(Clients clientId) {
        this.clientId = clientId;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", clientId=" + clientId +
                ", projectStatus='" + projectStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projects that = (Projects) o;
        return projectId == that.projectId &&
                clientId == that.clientId &&
                Objects.equals(projectName, that.projectName) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(projectStatus, that.projectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, startDate, endDate, clientId, projectStatus);
    }
}
