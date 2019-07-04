package app.entities;

        import javax.persistence.*;
        import java.util.Arrays;
        import java.util.Objects;

@Entity
@Table(name = "TABLE_USERS", schema = "PUBLIC", catalog = "CALCULATOR-DB")
public class TableUsersEntity {
    private long id;
    private String name;
    private String surname;
    private String patronymic;
    private String username;
    private String password;
    private byte[] cookie;
    private TableOperationsResultsEntity tableOperationsResultsByCookie;
    private TableOperationsResultsEntity tableOperationsResultsByCookie_0;

    @Id
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SURNAME", nullable = false, length = 255)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "PATRONYMIC", nullable = false, length = 255)
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Basic
    @Column(name = "USERNAME", nullable = false, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "COOKIE", nullable = true)
    public byte[] getCookie() {
        return cookie;
    }

    public void setCookie(byte[] cookie) {
        this.cookie = cookie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableUsersEntity that = (TableUsersEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(patronymic, that.patronymic) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Arrays.equals(cookie, that.cookie);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, surname, patronymic, username, password);
        result = 31 * result + Arrays.hashCode(cookie);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "COOKIE", referencedColumnName = "COOKIE")
    public TableOperationsResultsEntity getTableOperationsResultsByCookie() {
        return tableOperationsResultsByCookie;
    }

    public void setTableOperationsResultsByCookie(TableOperationsResultsEntity tableOperationsResultsByCookie) {
        this.tableOperationsResultsByCookie = tableOperationsResultsByCookie;
    }

    @ManyToOne
    @JoinColumn(name = "COOKIE", referencedColumnName = "COOKIE")
    public TableOperationsResultsEntity getTableOperationsResultsByCookie_0() {
        return tableOperationsResultsByCookie_0;
    }

    public void setTableOperationsResultsByCookie_0(TableOperationsResultsEntity tableOperationsResultsByCookie_0) {
        this.tableOperationsResultsByCookie_0 = tableOperationsResultsByCookie_0;
    }
}
