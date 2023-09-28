package com.metro.services;

import com.metro.models.Itinerary;
import com.metro.models.Station;

public interface IItinerary {
    Itinerary search(Station start, Station arrival);
}
