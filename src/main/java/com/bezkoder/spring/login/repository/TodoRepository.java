package com.bezkoder.spring.login.repository;

import com.bezkoder.spring.login.models.Todo;
import com.bezkoder.spring.login.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    Optional<List<Todo>> findByUser(String user);

    @Transactional
    @Modifying
    @Query("update Todo t set t.name = ?1, t.date=?2, t.edate=?3,t.comment=?4, t.completed=?5, t.user=?6 where t.id = ?7")
    void updateTodo(String name, LocalDateTime date, LocalDateTime edate, String comment, boolean completed, String user, String id);

    @Transactional
    @Modifying
    @Query("delete from Todo where id = ?1")
    void deleteTodo(String id);
}
