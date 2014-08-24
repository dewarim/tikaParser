# Grails plugin: TikaParser

## Description

This plugin wraps Apache Tika, a content analysis toolkit which can extract all kinds of content and metadata from files you provide.

## Usage

Add a line

    compile(':tika-parser:1.4.0')

to the plugins section in BuildConfig.groovy of your application.

You can now use the tikaService to extract a file's content as XML.

## What this plugin does

It adds the Tika parsers as a dependency and provides a TikaService for easy content extraction.

## Warning

This plugin downloads "all the things", meaning it may increase the size of you application's war file by 20-30 MByte. But then, it provides so much functionality like parsing of Excel and MS Word files etc which are hard to come by with other libraries.

## Versioning

The version numbers are derived from the original library's version scheme: this plugin is version 1.3.0, meaning it is based on Tika 1.3 and is the first version of this plugin.

## Metadata

* Author: Ingo Wiarda
* Contact: ingo_wiarda@dewarim.de
* License: Apache 2.0 http://www.apache.org/licenses/
* Source code: https://github.com/dewarim/tikaParser
* Original project: http://tika.apache.org
