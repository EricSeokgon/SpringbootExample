package tk.hadeslee.springdomain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Project: SpringbootExample
 * FileName: User
 * Date: 2015-12-09
 * Time: 오후 3:17
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Data
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private Integer age;


}
