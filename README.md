# sonar-jira
SonarQube JIRA Plugin
(with metrics by priority)
================

Simple extension of the SonarQube JIRA plugin.

The goal is to have JIRA issues by priority as additional metrics.
Quality gates can then be configured to check for:

* JIRA Blocker issues
* JIRA Critical issues
* JIRA Major issues
* JIRA Minor issues
* JIRA Trivial issues

in addition to the total number of JIRA issues.
Note that this extension is still JIRA filter and SOAP service based.

Original plugin homepage:
http://docs.codehaus.org/display/SONAR/JIRA+Plugin
