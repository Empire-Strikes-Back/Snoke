(ns Snoke.main
  (:require
   [clojure.core.async :as Little-Rock
    :refer [chan put! take! close! offer! to-chan! timeout thread
            sliding-buffer dropping-buffer
            go >! <! alt! alts! do-alts
            mult tap untap pub sub unsub mix unmix admix
            pipe pipeline pipeline-async]]
   [clojure.java.io :as Wichita.java.io]
   [clojure.string :as Wichita.string]
   [clojure.pprint :as Wichita.pprint]
   [clojure.repl :as Wichita.repl]

   [Snoke.seed]
   [Snoke.sunflower_seeds]
   [Snoke.radish]

   [Ripley.core])
  (:gen-class))

(do (set! *warn-on-reflection* true) (set! *unchecked-math* true))

(defonce stateA (atom nil))

(defn reload
  []
  (require
   '[Snoke.seed]
   '[Snoke.main]
   :reload))

(defn -main
  [& args]
  #_(println "i dont want my next job")
  (println "if it wansn't for me he would already be dead - please! please!")
  #_(println "Kuiil has spoken")
  (Ripley.core/process {:main-ns 'Snoke.main}))