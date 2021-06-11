import axios from 'axios'

export default class JobPostingService{

    getAll(){
        return axios.get("localhost:8080/api/jobPostings/getall")
    }

    getActiveAll(){
        return axios.get("localhost:8080/api/jobPostings/getActiveAll")
    }

    getActiveAllByCompanyName(companyName){
        return axios.get("localhost:8080/api/jobPostings/getActiveAllByCompanyName",
        {params:companyName}
        )
    }

    getActiveAllOrderedByDate(){
        return axios.get("localhost:8080/api/jobPostings/getActiveAllOrderedByDate")
    }

    add(jobPosting){
        return axios.post("localhost:8080/api/jobPostings/add",jobPosting)
    }

    changeActiveById(id){
        return axios.post("localhost:8080/api/jobPostings/changeActiveById",id)
    }


}