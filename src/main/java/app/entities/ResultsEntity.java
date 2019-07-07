package app.entities;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "RESULTS")
public class ResultsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "OPERATION", nullable = false)
    private String operation;

    @Column(name = "RESULT", nullable = false)
    private String result;

    @OneToOne
    @JoinColumn(name = "COOKIE", nullable = false)
    private UsersEntity usersEntity;

    public ResultsEntity() {
    }
}
