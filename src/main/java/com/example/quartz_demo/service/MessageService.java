package com.example.quartz_demo.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class MessageService implements Job {

    public void sendMessage() {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "] SOS");
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        sendMessage();
    }
}
