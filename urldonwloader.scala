#!/usr/bin/env scala

// This script is for downloading a bunch of files from some URL where url changes only slightly at the end
// e.g. : http://ampcamp-data.s3.amazonaws.com/wikistats_20090505-01/part-00100 to 00166
// This is blocking call. The code needs improvements to trigger multiple downloads at a time.

for(a <- 100 to 166) {
  var fromURL = "constantURL" + a
  vat toFile = "pathToFile/FileName.extention"
  new URL(fromURL) #> new File(toFile) !!
}