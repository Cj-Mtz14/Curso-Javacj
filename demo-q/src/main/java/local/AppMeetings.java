package local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import local.entities.Meeting;
import local.repositories.MeetingDAO;;

public final class AppMeetings {
    private static MeetingDAO meetingDAO = new MeetingDAO();

    private static void showMeetings(Collection<Meeting> collection) {
        if (collection == null || collection.isEmpty()) {
            System.out.println("No items found.");
            return;
        }
        System.out.println("Meetings: [");
        collection.forEach(item -> System.out.println(item.toString(true)));
        System.out.println("]");
        System.out.println();
    }

    private static void showOptional(Optional<Meeting> optional) {
        optional.ifPresentOrElse(
                //
                item -> System.out.println(item.toString(true)),
                //
                () -> System.out.println("Reunión no encontrada"));

    }

    private static void showMeetings() {
        System.out.println("----------- Find All -----------");
        showMeetings(meetingDAO.findAll());
        // meetingDAO.findAll().forEach(item -> {
        // System.out.println(item.toString(true));
        // });

        System.out.println("----------- Find by date -----------");
        List<Meeting> m = meetingDAO.findByDate(LocalDate.of(2025, 07, 25));
        showMeetings(m);
        System.out.println("----------- Next meeting -----------");
        Meeting m1 = meetingDAO.nextMeetingBasic();
        System.out.println(m1.toString(true));
    }

    @SuppressWarnings("unused")
    private static void checkMeetingInitial() {

        Meeting m1 = meetingDAO.save(new Meeting("Primera reunion", LocalDateTime.now().plusDays(2)));
        Meeting m2 = meetingDAO.save(new Meeting("Segunda reunion", LocalDateTime.now().plusDays(3)));
        System.out.println(m1);
        System.out.println(m2);

        System.out.println("----------- Find All -----------");
        showMeetings(meetingDAO.findAll());
        System.out.println("----------- Find by ID valid -----------");
        showOptional(meetingDAO.findById(1));
        System.out.println("----------- Find by ID invalid -----------");
        showOptional(meetingDAO.findById(100));

        System.out.println("----------- Delete by ID 1 (si existe)-----------");
        // try {
        // meetingDAO.delete(meetingDAO.findById(2).get());
        // } catch (Exception e) {
        // System.out.println("Meeting ya eliminado");
        // }

        meetingDAO.findById(1).ifPresentOrElse(entity -> meetingDAO.delete(entity),
                () -> System.out.println("Reunión no encontrada: no se ha podido eliminar"));
        System.out.println("----------- Find All after delete -----------");
        System.out.println(meetingDAO.findAll());

        try {
            Meeting m3 = meetingDAO.findById(3).orElseThrow(() -> new RuntimeException("Meeting not found"));
            meetingDAO.detach(m3);
            System.out.println("----------- Update by ID 2 -----------");
            m3.setDescription("Reunion actualizada");
            m3.setDate(LocalDateTime.now().plusDays(4));
            meetingDAO.update(m3);
            System.out.println("----------- Find All after update -----------");
            System.out.println(meetingDAO.findAll());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Meetings application");
        // checkMeetingInitial();
        showMeetings();
    }
}