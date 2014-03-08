# ch09-brepl-hello

"Hello World" using the browser REPL (bREPL).

Everything worked except I could not get the cljsbuild repl-listen
task to serve pages. I think I failed to start the ring server serving
pages on port 3000. I originally thought the leiningen task would do
it "automagically"; however on re-reading the text, I thought,
"Perhaps not."

I ran a Clojure REPL in a separate shell, re-ran the code to start the
Ring server and it worked!

## Usage

FIXME

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
