package com.kundan.day16june2026;

sealed  interface Notification
permits Email,SMS,Push {

}
