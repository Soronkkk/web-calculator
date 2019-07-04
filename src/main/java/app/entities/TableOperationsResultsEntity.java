package app.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TABLE_OPERATIONS_RESULTS", schema = "PUBLIC", catalog = "CALCULATOR-DB")
public class TableOperationsResultsEntity {
    private long id;
    private String operation;
    private String result;

    @Id
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "OPERATION", nullable = false, length = 255)
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Basic
    @Column(name = "RESULT", nullable = false, length = 255)
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableOperationsResultsEntity that = (TableOperationsResultsEntity) o;
        return id == that.id &&
                Objects.equals(operation, that.operation) &&
                Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, operation, result);
    }
}
