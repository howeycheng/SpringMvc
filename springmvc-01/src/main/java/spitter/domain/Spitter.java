package spitter.domain;

/**
 * @author howey
 */
public class Spitter {

    private int projectId;
    private String name;
    private String description;
    private String createUser;

    public Spitter(int projectId, String name, String description, String createUser) {
        this.projectId = projectId;
        this.name = name;
        this.description = description;
        this.createUser = createUser;
    }

    public int getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCreateUser() {
        return createUser;
    }

}
