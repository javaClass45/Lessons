package optional;


import java.util.*;

public class OptionalMain {

    public static void main(String[] args) {

        DataBase dataBase = new DataBase();


        //антипаттерн - скрыли null
        Optional<Event> optionalEvent = dataBase.getOptNewTodayEvent();
        optionalEvent.map(e -> {
            System.out.println(e.toString());
            return e;
        });

        Event event;
        Optional<Event> eventOpt = dataBase.findEventById("324234234WE-SDG$235");
        event = eventOpt.orElse(dataBase.getNewTodayEvent());
        System.out.println(event.hour);

    }


    static class Event {
        String id;
        Date date;
        float hour;

        public Event(String id, Date date, float hour) {
            this.id = id;
            this.date = date;
            this.hour = hour;
        }
    }


    private static class DataBase {
        public Optional<Event> getOptNewTodayEvent() {
            Event event = new Event(UUID.randomUUID().toString(), new Date(), 0);
            return Optional.ofNullable(event);
        }


        public Event getNewTodayEvent() {
            Event event = new Event(UUID.randomUUID().toString(), new Date(), 0);
            return event;
        }

        public Optional<Event> findEventById(String id) {
            Event result = null;
            // ...

            return Optional.ofNullable(result);
        }


        public List<Event> getEventByDay(Date day) {
            ArrayList<Event> result = new ArrayList<>();
            return result;
        }


    }
}
