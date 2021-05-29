--
-- Database: `student`
--

-- --------------------------------------------------------

--
-- Table structure for table `infotable`
--

CREATE TABLE `infotable` (
  `form_id` int(50) DEFAULT NULL,
  `batch_no` int(50) DEFAULT NULL,
  `student_id` int(50) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `middle_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  `dob` varchar(50) DEFAULT NULL,
  `father_name` varchar(50) DEFAULT NULL,
  `mother_name` varchar(50) DEFAULT NULL,
  `permanent_add` varchar(50) DEFAULT NULL,
  `temporary_add` varchar(50) DEFAULT NULL,
  `particular_school` varchar(50) DEFAULT NULL,
  `particular_higherschool` varchar(50) DEFAULT NULL,
  `name_of_school` varchar(50) DEFAULT NULL,
  `name_of_higherschool` varchar(50) DEFAULT NULL,
  `percentage_school` varchar(50) DEFAULT NULL,
  `percentage_higherschool` varchar(50) DEFAULT NULL,
  `passed_year_school` varchar(50) DEFAULT NULL,
  `passed_year_higherschool` varchar(50) DEFAULT NULL,
  `image` longblob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `infotable`
--

INSERT INTO `infotable` (`form_id`, `batch_no`, `student_id`, `first_name`, `middle_name`, `last_name`, `email`, `contact`, `dob`, `father_name`, `mother_name`, `permanent_add`, `temporary_add`, `particular_school`, `particular_higherschool`, `name_of_school`, `name_of_higherschool`, `percentage_school`, `percentage_higherschool`, `passed_year_school`, `passed_year_higherschool`, `image`) VALUES
(1, 2071, 7, 'aaa', '', 'aaa', 'sasas@sth.com', '9845555555', '2014-11-19', 'xyz', 'abc', 'htd', 'npl', 'dsd', 'awsa', 'hajkl', 'lkjh', '69', '59', '2068', '2070', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

select * from infotable
