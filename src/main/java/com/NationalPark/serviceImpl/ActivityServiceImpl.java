package com.NationalPark.serviceImpl;

import com.NationalPark.dao.ActivityRepository;
import com.NationalPark.models.Activity;
import com.NationalPark.models.UpdateActivity;
import com.NationalPark.service.ActivityService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityRepository repo;

	@Override
	public Optional<Activity> getActivity(Long idlong) {
		return repo.findById(idlong);
	}

	@Override
	public List<Activity> getActivities() {
		return repo.findAll();
	}

	@Override
	public Activity saveActivity(Activity activity) {
		return repo.save(activity);
	}

	@Override
	public List<Activity> getSafari() {
		return repo.findSafari();
	}

	@Override
	public List<Activity> getOther() {
		return repo.findOthers();
	}

	@Override
	public List<Activity> getSafariById(Long idlong) {
		return repo.findSafariById(idlong);
	}

	@Override
	public List<Activity> getSafariByParkId(String park_id) {
		return repo.findSafariByParkId(park_id);
	}

	@Override
	public List<Activity> getOthersByParkId(String park_id) {
		return repo.findOthersByParkId(park_id);
	}

	@Override
	public List<Activity> getOtherById(String id) {
		return repo.findOthersById(id);
	}

	@Override
	public List<String> getActivityName() {
		return repo.findName();
	}

	@Override
	public void updateActivity(UpdateActivity activity) {
		repo.update(activity.getId(),activity.getAbout(),activity.getName(),activity.getPrice(),activity.getImage());
	}

	@Override
	public void delete(String id) {
		Long idlong = Long.parseLong(id);
		repo.deleteById(idlong);
	}

	@Override
	public List<Activity> getAllByParkId(String park_id) {
		return repo.getAll(park_id);
	}
}
