package com.example.demo.service;


import com.example.demo.entity.JobAndTrigger;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IJobAndTriggerService {
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
