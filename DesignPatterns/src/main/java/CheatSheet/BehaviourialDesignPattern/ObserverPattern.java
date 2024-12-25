package CheatSheet.BehaviourialDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The  Observer pattern.
 */
public class ObserverPattern {

    /**
     * The interface Subject.
     */
// Subject Interface
    interface Subject {
        /**
         * Register observer.
         *
         * @param o the o
         */
        void registerObserver(Observer o);

        /**
         * Remove observer.
         *
         * @param o the o
         */
        void removeObserver(Observer o);

        /**
         * Notify observers.
         */
        void notifyObservers();
    }

    /**
     * The interface Observer.
     */
// Observer Interface
    interface Observer {
        /**
         * Update.
         *
         * @param message the message
         */
        void update(String message);
    }

    /**
     * The type News agency.
     */
// Concrete Subject
    class NewsAgency implements Subject {
        /**
         * The Observers.
         */
        private final List<Observer> observers;
        /**
         * The News.
         */
        private String news;

        /**
         * Instantiates a new News agency.
         */
        public NewsAgency() {
            this.observers = new ArrayList<>();
        }

        /**
         * Register observer.
         *
         * @param o the o
         */
        @Override
        public void registerObserver(Observer o) {
            observers.add(o);
        }

        /**
         * Remove observer.
         *
         * @param o the o
         */
        @Override
        public void removeObserver(Observer o) {
            observers.remove(o);
        }

        /**
         * Notify observers.
         */
        @Override
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(news);
            }
        }

        /**
         * Sets news.
         *
         * @param news the news
         */
        public void setNews(String news) {
            this.news = news;
            notifyObservers();
        }
    }


    /**
     * The type News channel.
     */
// Concrete Observer
    class NewsChannel implements Observer {
        /**
         * The Name.
         */
        private final String name;

        /**
         * Instantiates a new News channel.
         *
         * @param name the name
         */
        public NewsChannel(String name) {
            this.name = name;
        }

        /**
         * Update.
         *
         * @param news the news
         */
        @Override
        public void update(String news) {
            System.out.println(name + " received news: " + news);
        }
    }
}
