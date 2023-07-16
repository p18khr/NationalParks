package com.NationalPark.service;

import com.NationalPark.models.activity;
import com.NationalPark.models.UpdateActivity;

import java.util.List;
import java.util.Optional;

public interface ActivityService {
	Optional<activity> getActivity(Long idlong);

	List<activity> getActivities();

	activity saveActivity(activity activity);

	List<activity> getSafari();

	List<activity> getOther();

	List<activity> getSafariById(Long idlong);

	List<activity> getSafariByParkId(String park_id);

	List<activity> getOthersByParkId(String park_id);

	List<activity> getOtherById(String id);

	List<String> getActivityName();

	void updateActivity(UpdateActivity activity);

	void delete(String id);

	List<activity> getAllByParkId(String park_id);
}
