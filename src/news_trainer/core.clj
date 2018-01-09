(ns news-trainer.core
  (:gen-class)
  (:require [creddit.core :as creddit]))

(def subreddits ["worldnews"
                 "politics"
                 "uspolitics"
                 "geopolitics"
                 "uncensorednews"
                 "worldevents"
                 "news"
                 "NeutralPolitics"])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
