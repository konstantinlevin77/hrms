import axios from 'axios'

export default class jobseekerCvService{

    getAll(){
        return axios.get("localhost:8080/api/jobseekerCvs/getAll")
    }

    getAllByJobseekerId(jobseekerId){
        return axios.get("localhost:8080/api/jobseekerCvs/getAllByJobseekerId",
        {params:jobseeker_id}
        )
    }

    add(jobseekerCv){
        return axios.post("localhost:8080/api/jobseekerCvs/add",jobseekerCv)
    }

}