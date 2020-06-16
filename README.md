# Uncertainty-Aware Self-Adaptive Architecture (draft)
This folder contains research related to my thesis that targets Uncertainty-Aware Self-Adaptive CPS. It contains a systematic review over EU projects that target smart and collective behavior in CPS. Also, it contains a set of APIs to handle Delays, Noise and Operational Boundaries. The APIs are presented in a set of simple tests, and applied on a Platoon example. 

Systematic Review
----------------------------------------------------------

The folder contains the data of the study in systematicreviewdata.xlsx and the technical report in FullReportReview2019.pdf for the systematic review performed over EU projects.


APIs
----------------------------------------------------------
We present a set of data types used in the APIs. The APIs contain operators helping in handling delays using ODE equations, noise using linear regression, and operational boundaries using Bayesian linear regression and correlation.   

Simple Tests
----------------------------------------------------------
A set of simple tests for the operations in the APIs.


Platoon Example
----------------------------------------------------------
We present a simple example of platoon includes 3 vehicles. The API operators are used in the mode-switching conditions in each vehicle to evaluate the situation when the vehicle should switch from CACC to ACC.
