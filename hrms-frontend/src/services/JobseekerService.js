import axios from 'axios'

export default class JobseekerService {

    getAll(){
        return axios.get("localhost:8080/api/jobseekers/getall")
    }

    add(jobseeker){
        return axios.post("localhost:8080/api/jobseekers/add",jobseeker)
    }

    verify(id){
        return axios.post("localhost:8080/api/jobseekers/verify",id)
    }

}