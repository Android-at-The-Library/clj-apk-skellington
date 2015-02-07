(ns org.stuff.events.main
    (:use [neko.activity :only [defactivity set-content-view! *a]]
          [neko.threading :only [on-ui]]
          [neko.find-view :only [find-view]])
    (:import android.widget.TextView))


(def main-layout [:linear-layout {:orientation :vertical}
                  [:edit-text {:hint "each function in the composition", :id ::element_a}]  ;; some discrete elemtn
                  [:edit-text {:hint "needs to be evaluated in the repl", :id ::element_b }]
                  [:button {:text "for changes to take place"}]
                  ;;or of course, the whole program can be written, compiled and uploaded normally
                  ])

(defactivity org.stuff.events.MainActivity
  :key :main
  :on-create
  (fn [this bundle]
    (on-ui
      (set-content-view! (*a) main-layout))))
