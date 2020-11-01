package com.cdac.service;

import java.util.List;

import com.cdac.dto.Train;

public interface ITrainService {
	void addTrain(Train train);

	List<Train> selectAll();

	void removeTrain(int trainId);

	void modifyTrain(Train train);

	Train findTrain(int trainId);
}
