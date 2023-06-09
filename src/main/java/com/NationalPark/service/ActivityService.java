package com.NationalPark.service;

import com.NationalPark.models.Activity;
import com.NationalPark.models.UpdateActivity;

import java.util.List;
import java.util.Optional;

public interface ActivityService {
	Optional<Activity> getActivity(Long idlong);

	List<Activity> getActivities();

	Activity saveActivity(Activity activity);

	List<Activity> getSafari();

	List<Activity> getOther();

	List<Activity> getSafariById(Long idlong);

	List<Activity> getSafariByParkId(String park_id);

	List<Activity> getOthersByParkId(String park_id);

	List<Activity> getOtherById(String id);

	List<String> getActivityName();

	void updateActivity(UpdateActivity activity);

	void delete(String id);

	List<Activity> getAllByParkId(String park_id);
}
