package com.example.portaljob.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Interview {
    @Id
    UUID interviewId;

    UUID userId;

    UUID jobId;

    String interviewDateAndTime;

    String status;

    boolean isAccepted;

    @CreationTimestamp
    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column (name =  "modified_time")
    private LocalDateTime modifiedTime;

}
