package com.example.quartz_demo.service;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScheduleManager {
    @Autowired
    private Scheduler scheduler;

    @Autowired
    private JobDetail jobDetail;

    @Autowired
    private Trigger trigger;

    public void run() throws SchedulerException {
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
    }
}
