(defproject news-trainer "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [creddit "1.0.0"]]
  :main ^:skip-aot news-trainer.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
