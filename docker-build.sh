#!/bin/sh
docker build . --tag complete
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run -p 8080:8080 complete"
